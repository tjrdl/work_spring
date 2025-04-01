package com.lgy.spring_15_1;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_14_1.domain.SampleVO;

//@Controller
@RestController // pom.xml �����Ǿ�� ��� ����
@RequestMapping("/sample")
public class SampleController {

//   @GetMapping(value = "/getSample")
   // xml�̳� jsom ������ �� ���� �� �߰�
   @GetMapping(value = "/getSample", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE
                                    , MediaType.APPLICATION_ATOM_XML_VALUE})
   
   public SampleVO getSample() {
      return new SampleVO(112, "��Ÿ", "�ε�");
      
   }
   
/*   @GetMapping(value="/getList")
   public List<SampleVO> getList() {
	   return IntStream.range(1,10).mapToObj(i->new SampleVO(i, i+"First", i+"Last"))}
	 */
}
