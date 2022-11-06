package com.Qa.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin =  {
                    // "pretty",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                    "json:target/cucumber.json"

            },
            features = "src/test/resources/features" ,
            glue = "com/Qa/Step_Definitions",
            dryRun = true,
            tags = "login",
            publish = true

    )
    public class CukesRunner {

    }

