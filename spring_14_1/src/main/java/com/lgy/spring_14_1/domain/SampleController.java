package com.lgy.spring_14_1.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_14_1.domain.SampleVO;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

//@Controller
@RestController // pom.xml �����Ǿ�� ��� ����
@RequestMapping("/sample")
@Slf4j
public class SampleController {

//   @GetMapping(value = "/getSample")
	// xml�̳� jsom ������ �� ���� �� �߰�
	@GetMapping(value = "/getSample", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_ATOM_XML_VALUE })

	public SampleVO getSample() {
		return new SampleVO(112, "��Ÿ", "�ε�");

	}

	@GetMapping(value = "/getList")
	// ��Ʈ��, ���ٽ��� ������Ʈ �������� java compiler version Ȯ��
	public List<SampleVO> getList() {
		return IntStream.range(1, 10).mapToObj(i -> new SampleVO(i, i + "First", i + "Last"))
				.collect(Collectors.toList());
	}

	@GetMapping(value = "/getMap")
	public Map<String, SampleVO> getMap() {
		Map<String, SampleVO> map = new HashMap<String, SampleVO>();
		map.put("First", new SampleVO(111, "groot", "junior"));
		return map;
	}
	@GetMapping(value = "/check",params= {"height","weight"})
	// ResponseEntity: ������+http �����ڵ带 ����
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		SampleVO vo = new SampleVO(0,""+height,""+weight);
		ResponseEntity<SampleVO> result = null;
		
		if(height < 150) {
			// HttpStatus.BAD_GATEWAY : http ���� ����
			// http://localhost:8989/spring_14_1/sample/check?height=140&weight=40
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
			// HttpStatus.OK : http ���� ����
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
			
		}
		
		return result;
	}
	@GetMapping(value = "/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") String pid){
		
		
		return new String[] {"category :"+cat,"product id : "+pid};
	}
	
	@PostMapping("/ticket")
//	@RequestBody : ���۵� json �����͸� TicketVO Ÿ���� ��ü�� ��ȯ
//	public void convert(@RequestBody TicketVO ticketVO){
		public TicketVO convert(@RequestBody TicketVO ticketVO){
		System.out.println("@# ticketVO=>"+ticketVO);
		log.info("@# ticketVO=>"+ticketVO);
		
		return ticketVO;
	}
	@PostMapping("/info")
	public MemberVO convert(@RequestBody MemberVO memberVO){
		System.out.println("@# memberVO=>"+memberVO);
		log.info("@# memberVO=>"+memberVO);
		
		return memberVO;
	}

}
