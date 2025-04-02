package com.lgy.spring_14_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.*;

import com.lgy.spring_14_1.domain.UserVO;

@RestController
@RequestMapping("/user") // 공통 URL prefix 설정
public class UserController {
    private Map<String, UserVO> userMap;

    // 객체 생성 후 초기값 설정
    @PostConstruct
    public void init() {
        userMap = new HashMap<>();
        userMap.put("1", new UserVO("1", "홍길동", "111-2221", "서울1"));
        userMap.put("2", new UserVO("2", "홍길동2", "111-2222", "서울2"));
        userMap.put("3", new UserVO("3", "홍길동3", "111-2223", "서울3"));
    }

    // 모든 사용자 조회
    @GetMapping("/all")
    public List<UserVO> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    // 특정 사용자 조회
    @GetMapping("/{id}")
    public UserVO getUser(@PathVariable("id") String id) {
        return userMap.get(id);
    }

    // 사용자 추가
    @PostMapping("/{id}")
    public void postUser(
        @PathVariable("id") String id,
        @RequestParam("name") String name,
        @RequestParam("phone") String phone,
        @RequestParam("address") String address) {
        
        UserVO userVO = new UserVO(id, name, phone, address);
        userMap.put(id, userVO);
    }

    // 사용자 정보 수정
    @PutMapping("/{id}")
    public void putUser(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
    	UserVO userVO = new UserVO(id,name,phone,address);
		userMap.put(id, userVO);
    }

    // 사용자 삭제
    @DeleteMapping("/{id}")
    public UserVO delUser(@PathVariable("id") String id) {
		return userMap.remove(id);
	}
}
