package com.shufa.shufa;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.shufa.dbModel.AdminUserDTO;
import com.shufa.mapper.AdminUserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShufaApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	@Rollback
	public void findByName() throws Exception {
		List<AdminUserDTO> u = userMapper.findByName("AAA");
		Assert.assertEquals(20+"", u.get(0).getAdminPwd());
	}
	
	@Autowired
	private AdminUserMapper userMapper;

}
