# Project 1: Employee Reimbursment System (ERS) using The Hibernate ORM
In this project I built a CRUD web application that functions as an Expense Reimbursement System (ERS). It manages the process of reimbursing employees for expenses incurred while on company time. 
* Some of the features that it entails are:
  * All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. 
  * Financ managers can log in and view all reimbursement requests and past history for all employees in the company. 
  * Finance managers are authorized to approve and deny requests for expense reimbursement.

## Tech Stack
Through this project I developed and used a variety of skills, including the ones listed below.
- Java 8
- JUnit
- Mockito
- Apache Maven
- Jackson library (for JSON marshalling/unmarshalling)
- Java EE Servlet API (v4.0+)
- PostGreSQL deployed on AWS RDS
- Postman
- AWS CodeBuild
- AWS CodePipeline
- Git SCM (on GitHub)

## Employee User Stories 
- An Employee can login
- An Employee can view the Employee Homepage
- An Employee can logout
- An Employee can submit a reimbursement request
- An Employee can view their pending reimbursement requests
- An Employee can view their resolved reimbursement requests
- An Employee can view their information
- An Employee can update their information

## Manager User Stories
- A Manager can login
- A Manager can view the Manager Homepage
- A Manager can logout
- A Manager can approve/deny pending reimbursement requests
- A Manager can view all pending requests from all employees
- A Manager can view all resolved requests from all employees and see which manager resolved it
- A Manager can view all Employees
- A Manager can view reimbursement requests from a single Employee 

## Flowcharts
**State-chart Diagram (Reimbursement Statuses)** 
<br>
    <img src=".ERDandFlows/../ERDandFlows/StateChartDiagram.jpg">
<br>

**Logical Model**
<br>
    <img src=".ERDandFlows/../ERDandFlows/LogicalModel.jpg">
<br>

**Physical Model**
<br>
    <img src=".ERDandFlows/../ERDandFlows/PhysicalDiagram.jpg">
<br>

**Use Case Diagram**
<br>
    <img src="../ERDandFlows/../ERDandFlows/UserCaseDiagram.jpg">
<br>

**Activity Diagram**
<br>
    <img src=".ERDandFlows/../ERDandFlows/ActivityDiagram.jpg">
<br>

## Technical Requirements
### MVP:
- [ ] The back-end system shall use **your custom ORM** to connect to an **AWS RDS Postgres database**. 
- [ ] JDBC logic is abstracted away by the custom ORM 
- [ ] Programmatic persistence of entities (basic CRUD support) using custom ORM
- [ ] File-based or programmatic configuration of entities
- [ ] 60% line coverage of all service layer classes
- [ ] Generated Jacoco reports that display coverage metrics
- [ ] Usage of the java.util.Stream API within your project
- [ ] Custom ORM source code should be included within the web application as a Maven dependency
- [ ] The application shall use Postman to test endpoints that call your server-side components. 
- [ ] The application shall follow proper layered architecture
- [ ] The application shall implement log4j for appropriate logging. 

### Stretch Goals:
- [ ] Custom ORM supports basic transaction management (begin, commit, savepoint, rollback) 
- [ ] Custom ORM supports connection pooling
- [ ] Session-based caching to minimize calls to the database for already retrieved data
- [ ] Deployment of web application to AWS EC2 (use of AWS Elastic Beanstalk is permitted) 
- [ ] Continuous integration pipelines that builds some main branch each project (the ORM and the web app, separately)
- [ ] Passwords shall be encrypted in Java and securely stored in the database. 

## Init Instructions
- Create a new private repository within this organization for your custom ORM (naming convention: `ers_orm_name_p1`; with `orm_name` being replaced by the name of your custom library)
    - Make sure to add your trainer and team members as contributors to the repo
- Create another new private repostory within this organization for your ERS web application (naming convention: `ers_webapp_orm_name_p1`; with `orm_name` being replaced by the name of your custom library)
    - Make sure to add your trainer and team members as contributors to the repo

## Presentation
- Finalized version of custom ORM and web application must be pushed to repository within this organization by the presentation date (**May 18th, 2022**)
- 10-15 minute live demonstration of the web application (that leverages your custom ORM); demonstration will be performed using Postman to query your API's endpoints

### Resources for researching ORMs
- [What is an ORM?](https://blog.bitsrc.io/what-is-an-orm-and-why-you-should-use-it-b2b6f75f5e2a)
- [Hibernate Documentation](https://hibernate.org/orm/documentation/5.4/)
- [JavaLite ActiveJDBC Documentation](https://javalite.io/documentation)
- [Using Java Reflection](https://www.oracle.com/technical-resources/articles/java/javareflection.html)
