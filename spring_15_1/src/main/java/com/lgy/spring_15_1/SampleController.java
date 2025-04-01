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
@RestController // pom.xml 설정되어야 사용 가능
@RequestMapping("/sample")
public class SampleController {

//   @GetMapping(value = "/getSample")
   // xml이나 jsom 데이터 안 나올 때 추가
   @GetMapping(value = "/getSample", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE
                                    , MediaType.APPLICATION_ATOM_XML_VALUE})
   
   public SampleVO getSample() {
      return new SampleVO(112, "스타", "로드");
      
   }
   
/*   @GetMapping(value="/getList")
   public List<SampleVO> getList() {
	   return IntStream.range(1,10).mapToObj(i->new SampleVO(i, i+"First", i+"Last"))}
	 */
}
