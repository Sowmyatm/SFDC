//create backup/copy files -  frm main menu select manage jenkins, 
//then go to manage plugins>Available and search for backup
//when you go to manage jenkins and scroll down you will see 'backup manager' as an option

//adv jenkins - open source tool, 100+plugins to ease your work, it is built with java and
//hence portable to all platforms

//move or copy jenkins from one source to another
//----------------------------------------------
//install thin backup plugin on bth src and target jenk servers, 
//config backup dir on both
//on src jenk go to thin backup plugin -backup now
//copy frm jenk src bkup dir to jenk target bckup
//on target jenk go to thin bckup - restore and then restart jenk service

//deploy custom build of core plugin 
//----------------------------------
//go to mng jenk>mangplugin
//go to build proj click on config 
//in deploy war/jar container secn enter reqd details of the server on which fields need to 
//be deployed and click on save

//CRON syntax= to set up the scheduled time

//set up jenkin jobs
//-----------------------
//click on new item in dashboard, name your proj and select proj type
//setup configs
//create and update projs

//CI - It helps devs to integrate the code into shared repo at continous intervals of time.
//each intgn is verified by automated build to detect intgn errors as quickly as poosible.


//clone git repo via jenkins - create free tsyle proj, maven or github,
//go to src code mgmt select git, give the repo url and give credentials, clone by https &
//clone with ssh keys using respective urls
//git clone thro https : asks for usrnme and pwd
//clone throh ssh ask for pwd, provide ssh key generated

//pipeline - series of events or tasks performed in a specific sequence to transorm code 
//from version ctrl by using automation tools