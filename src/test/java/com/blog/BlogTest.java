package com.blog;


import com.blog.dao.BlogMapper;
import com.blog.dao.ListMapper;
import com.blog.entity.Dto.PageDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BlueBlogApplication.class)
public class BlogTest {
    @Autowired
    private ListMapper listMapper;
    @Test
    public void queryBlogListByHot1(){
      PageDto pageDto =  new PageDto();

      pageDto.setStart(0);
      pageDto.setTotal(5);
        System.out.println(listMapper.queryBlogListByHot1(pageDto));

    }
    @Test
    public void queryBlogListByHot(){
        PageDto pageDto = new PageDto();

        System.out.println(listMapper.queryBlogListByHot(pageDto));
        System.out.println(listMapper.queryHotCount(pageDto));
    }
    @Test
    public void queryBlogListByMonthAndHot() throws ParseException {

        PageDto pageDto = new PageDto();
        pageDto.setCondition("健身");
        listMapper.queryBlogListByMonthAndHot(pageDto);
        System.out.println(listMapper.queryMonthCount(pageDto));
        pageDto.setStart(0);
        pageDto.setTotal(1);
        listMapper.queryBlogListByMonthAndHot1(pageDto);
    }

    @Test
    public void queryBlogListByWeekAndHot(){
        PageDto pageDto = new PageDto();
      System.out.println(listMapper.queryWeekCount(pageDto));
        pageDto.setCondition("健身");
        listMapper.queryBlogListByWeekAndHot(pageDto);
        System.out.println(listMapper.queryWeekCount(pageDto));
        pageDto.setStart(0);
        pageDto.setTotal(2);
        listMapper.queryBlogListByWeekAndHot1(pageDto);
    }

    @Test
    public void queryBlogListByDayAndHot(){
        PageDto pageDto = new PageDto();
        System.out.println(listMapper.queryDayCount(pageDto));
        pageDto.setCondition("健身");
        System.out.println(listMapper.queryDayCount(pageDto));
        listMapper.queryBlogListByDayAndHot(pageDto);
        pageDto.setStart(0);
        pageDto.setTotal(2);
        listMapper.queryBlogListByDayAndHot1(pageDto);
    }

}
