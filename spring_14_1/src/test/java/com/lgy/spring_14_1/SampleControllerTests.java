package com.lgy.spring_14_1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; // 추가

import org.junit.Before; // 올바른 import
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;
import com.lgy.spring_14_1.domain.TicketVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
    "file:src/main/webapp/WEB-INF/spring/root-context.xml",
    "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@Slf4j
public class SampleControllerTests {
    @Setter(onMethod_ = {@Autowired}) 
    private WebApplicationContext ctx;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void testConvert() throws Exception { // 예외 추가
        TicketVO ticketVO = new TicketVO();
        ticketVO.setTno(123);
        ticketVO.setOwner("admin");
        ticketVO.setGrade("b");

        // Gson : 객체를 JSON 문자열로 변환
        String jsonStr = new Gson().toJson(ticketVO);
        log.info("@# jsonStr => " + jsonStr);

        // post("/sample/ticket") : POST 방식으로 컨트롤러 호출
        mockMvc.perform(post("/sample/ticket")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonStr))
                .andExpect(status().is(200)); // 변경 (더 가독성 좋은 방식)
    }
}
