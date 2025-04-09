package com.aishwaryak515;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/course-svc")
public class CourseController {

    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @GetMapping("/getAllAwsServices")
    public List<String> getAllAwsServices(){
        logger.info("Returning list of AWS services...");
        return Arrays.asList("EC2", "IAM", "RDS", "ECR", "EKS");
    }

    @GetMapping("/getAllDevopsTools")
    public List<String> getAllDevopsTools(){
        logger.info("Returning list of DevOps tools...");
        return Arrays.asList("Git", "Maven", "SonarQube", "Nexus", "Jenkins");
    }
}

