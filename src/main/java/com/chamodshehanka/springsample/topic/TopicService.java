package com.chamodshehanka.springsample.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 **/
@Service
public class TopicService {

    private List<Topic> topicList = Arrays.asList(
            new Topic("spring", "Spring Framework","Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("js", "JavaScript", "JavaScript Description")
    );

    public List<Topic> getAllTopics(){
        return topicList;
    }

}