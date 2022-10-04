package com.sparta.week01.controller;

import com.sparta.week01.domain.Course;
import com.sparta.week01.domain.CourseRepository;
import com.sparta.week01.domain.CourseRequestDto;
import com.sparta.week01.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CourseController {

    private final CourseService courseService;

    @DeleteMapping("/api/courses/{id}")
    public Long deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);
        return id;
    }
}
