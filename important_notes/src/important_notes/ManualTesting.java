	
	//Functional and non functional testing
	
	//Non functional testing// we don't do
	//performance testing, load testing, stress testing, accessibility testing, 
	
	//functional testing
	//WHITEBOX TESTING-code testing - code, class, method
//in white box testing, the tester is knowledgeable of the internal design of the application and analyzes
// it during testing
	
	//BLACKBOX TESTING : Black box testing is a software testing methodology in which the tester analyzes 
//the functionality of an application without a thorough knowledge of its internal design

//TEST PLAN?
//A test plan can be defined as a document for a software project that defines the approach, scope, 
//and intensity of the effort of software testing. 
//

//TEST STRATEGY
//The test strategy is a set of instructions or protocols that explain the test design and determine how
// the test should be performed.
	
//smoke testing- verifying the stability of the build, done at initial stages, to check
	//important features are working.
	//basic test cases for every build, before you accept the build. also known as 
	//build acceptance test, checking randomly

//Sanity - part of regression test, verifies the major functionalities like bug fixes,
	//done at the later stages, checking in order

//performance T- non-fncl s/w testing, to check under given workload how a s/m performs
	
//load T- non fncl testing, to check how a s/m behaves when multiple users are accessing it
	//simultaneously

//Stress T - to check the robustness of the s/m or s/w under extreme load
	
//Volume T - huge volume of data is acted upon the s/w. by increasing the voulme of data in
	//the db, the performance of the s/m is tested
	
//soak testing -s/m is tested under huge load over long period of time to check the 
	//behavior of the s/m
	
//functional testing - testing every function is working fine

//integration testing - testing the modules which are interconnected to each other. to be 
//tested within the modules and within the application

//UNIT TESTING - Unit testing is the process where you test the smallest functional unit of code.
	
//Regression testing - testing other modules are working fine after making some changes 
	//in one module. used for passed testing. can be done either in automation or manual Te

//retesting - used to ensure the test cases whivh failed in the last execution are fixed.
//used only for the failed testcases. It cannot be automated.

//user acceptance testing - Business ppl will do the UAT or they can hire some engineers 
	//or other ppl to test
	
//alpha -beta testing - aplha testing happens within the company or employees.ex: apple
	//Beta testing is done with the users with limited features : android
	
//adhoc testing(Explorative testing or monkey testing) - testing or giving the product to 
	//others who are not part of team 	
	
//build- executable file, refers to s/w part which is still in testing or which is not 
//tested yet
	
//release - ready to use, refers to s/w which is no longer in testing. one release will 
	//have several builds associated with it
	
//version - refers to variation of an earlier or original type of s/w
	
//bug- error in the s/w
//defect- flaw in the prod, not working as per the customers requirements
	
//verification -  Verification focuses on assessing whether the software product meets the
//specified requirements and standards.to check if we have built the right prod. static testing
	//methods- reviews, walkthroughs, inspections, desk checking
	
	
//validation -  Validation focuses on assessing whether the software product meets the user's actual 
//needs and expectations .to check the product is right, dynamic testing
	//methods- blackbox, whitebox , non-funcl testing

//unit testing - test only the particular funtionality

//Black Box Testing -is a software testing method in which the internal structure/design/
	//implementation of the item being tested is not known to the tester. Only the external
	//design and structure are tested.Tested by Testers. 

//White Box Testing- is a software testing method in which the internal structure/design/
	//implementation of the item being tested is known to the tester. Implementation and 
	//impact of the code are tested.Developers does WBT. pgmg knwldg is needed
	
//bug leakage -  when a bug is found by the end users or by the customers & missed by the 
	//QA team while testing the s/w

//bug release - Particular version of s/w  is released with known bugs/defects with low 
	//severity and low priority
	
//SDLC-Seq of activities during the s/w process like developing, testing, deploying

//STLC- seq of activities during s/w testing. involves testing team preparing test envs &
	// executing test cases

//prod env - in this env, the end user can see, interact with the new prod. Live testing.
	//All testings are completed before this point.
//dev env, staging env, prod env

//testing env- combination of h/w and s/w teams to execute test cases. 

//why automation- to avoid human errors, to run tests frequently, for complex and time 
//consuming tasks, when we want to run same test cases acrossmultiple m/cs at the same time


//automation testing failure -  ignoring manual testing
//lack of clarity when to use automation
//not giving attention to test reports
//web elts with undefined id's

//automation testing execution process
//Select a testing tool. 
//Define the scope of automation. ...
//Plan, design and develop. ...
//Execute the test. ...
//Maintenance.

//Simple Ways to Maintain Your Automated Tests
//Test Only What You Need. ...
//Separate Your Scenarios Into Smaller Test Cases. ...
//Remove Tests That Are No Longer Beneficial. ...
//Fix Broken Tests as Soon as Possible.

//handle test failures
// systematically collecting information, isolating the issue's scope, reviewing test code 
// for errors, examining the test environment and logs, and utilizing debugging tools.

