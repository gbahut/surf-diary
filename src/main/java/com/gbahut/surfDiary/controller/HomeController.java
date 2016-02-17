package com.gbahut.surfDiary.controller;

import com.gbahut.surfDiary.data.Report;
import com.gbahut.surfDiary.repository.ReportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gbahut on 24/01/16.
 */
@RestController
public class HomeController
{

    private static final Logger logger =
        LoggerFactory.getLogger(HomeController.class);

    private ReportRepository repository;

    @Autowired
    public HomeController(ReportRepository repository)
    {
        this.repository = repository;
    }

    @RequestMapping(value = { "/", "/home",
                              "/homepage" }, method = RequestMethod.GET)
    public String home()
    {
        return "home";

    }

    @RequestMapping(value = { "/show" }, method = RequestMethod.GET)
    public List<Report> addReport()
    {
        repository.save(new Report("20010101", 5, 6, "poor wavies"));

        return repository.findAll();

    }

}