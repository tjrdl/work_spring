package com.lgy.spring_14_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.*;

import com.lgy.spring_14_1.domain.UserVO;

@RestController
@RequestMapping("/user") // ���� URL prefix ����
public class UserController {
    private Map<String, UserVO> userMap;

    // ��ü ���� �� �ʱⰪ ����
    @PostConstruct
    public void init() {
        userMap = new HashMap<>();
        userMap.put("1", new UserVO("1", "ȫ�浿", "111-2221", "����1"));
        userMap.put("2", new UserVO("2", "ȫ�浿2", "111-2222", "����2"));
        userMap.put("3", new UserVO("3", "ȫ�浿3", "111-2223", "����3"));
    }

    // ��� ����� ��ȸ
    @GetMapping("/all")
    public List<UserVO> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    // Ư�� ����� ��ȸ
    @GetMapping("/{id}")
    public UserVO getUser(@PathVariable("id") String id) {
        return userMap.get(id);
    }

    // ����� �߰�
    @PostMapping("/{id}")
    public void postUser(
        @PathVariable("id") String id,
        @RequestParam("name") String name,
        @RequestParam("phone") String phone,
        @RequestParam("address") String address) {
        
        UserVO userVO = new UserVO(id, name, phone, address);
        userMap.put(id, userVO);
    }

    // ����� ���� ����
    @PutMapping("/{id}")
    public void putUser(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
    	UserVO userVO = new UserVO(id,name,phone,address);
		userMap.put(id, userVO);
    }

    // ����� ����
    @DeleteMapping("/{id}")
    public UserVO delUser(@PathVariable("id") String id) {
		return userMap.remove(id);
	}
}
