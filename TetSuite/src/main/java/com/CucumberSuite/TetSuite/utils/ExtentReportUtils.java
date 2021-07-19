package com.CucumberSuite.TetSuite.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportUtils {
    ExtentReports extentReports;
    ExtentHtmlReporter htmlReporter;
    ExtentTest extentTest;

    public ExtentReportUtils(String htmlReportFilename) {

        htmlReporter = new ExtentHtmlReporter(htmlReportFilename);

        extentReports = new ExtentReports();

        extentReports.attachReporter(htmlReporter);

    }

    public void createTestcase(String testcaseName) {

        extentTest = extentReports.createTest(testcaseName);

    }

    public void addLog(Status status, String comments) {

        extentTest.log(status, comments);

    }

    public void closeReports() {

        extentReports.flush();

    }

}
