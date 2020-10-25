$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/ui-automation/src/main/java/Features/pagantis.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Pagantis Simulator for calculating Installment amount",
  "description": "",
  "id": "verify-the-pagantis-simulator-for-calculating-installment-amount",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test scenario for Pagantis",
  "description": "",
  "id": "verify-the-pagantis-simulator-for-calculating-installment-amount;test-scenario-for-pagantis",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user launched the pagantis",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the title of page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters 2 months for installment",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify the installment amount",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-the-pagantis-simulator-for-calculating-installment-amount;test-scenario-for-pagantis;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "verify-the-pagantis-simulator-for-calculating-installment-amount;test-scenario-for-pagantis;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 14,
      "id": "verify-the-pagantis-simulator-for-calculating-installment-amount;test-scenario-for-pagantis;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Test scenario for Pagantis",
  "description": "",
  "id": "verify-the-pagantis-simulator-for-calculating-installment-amount;test-scenario-for-pagantis;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user launched the pagantis",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the title of page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters 2 months for installment",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify the installment amount",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PagantisSimulatorDefinition.user_launched_the_pagantis()"
});
formatter.result({
  "duration": 10695118300,
  "status": "passed"
});
formatter.match({
  "location": "PagantisSimulatorDefinition.verify_the_title_of_page()"
});
formatter.result({
  "duration": 6701000,
  "status": "passed"
});
formatter.match({
  "location": "PagantisSimulatorDefinition.user_enters_2_months_for_installment()"
});
formatter.result({
  "duration": 18400,
  "status": "passed"
});
formatter.match({
  "location": "PagantisSimulatorDefinition.verify_the_installment_amount()"
});
formatter.result({
  "duration": 36800,
  "status": "passed"
});
formatter.match({
  "location": "PagantisSimulatorDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1388166000,
  "status": "passed"
});
});