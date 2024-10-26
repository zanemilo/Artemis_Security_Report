<h1>Artemis Financial Security Report</h1>

<h3>Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?</h3>
Artemis Financial is a consulting firm specializing in individualized financial plans, including savings, retirement, investments, and insurance. They needed a robust security upgrade for their RESTful web API to protect sensitive customer information from external threats. The company wanted me to identify and address security vulnerabilities in their software to ensure compliance with regulatory standards and enhance overall data protection.

<h3>What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?</h3>
I conducted a thorough manual code review and integrated static testing tools to identify critical vulnerabilities in their application. Coding securely is essential because it prevents potential breaches that could compromise sensitive data and damage a company's reputation. Implementing strong software security measures enhances customer trust and ensures compliance with industry regulations, contributing to the company's long-term success.

<h3>Which part of the vulnerability assessment was challenging or helpful to you?</h3>
Identifying vulnerabilities related to outdated dependencies and hard-coded credentials was particularly challenging but also insightful. The most challenging aspect was discerning whther a vulnerability was a false positive, which involved a deeper dive into each vulnerability found to ensure nothing that was an actual threat persisted. It was helpful to delve deep into dependency management and understand how outdated libraries can introduce significant security risks. This experience reinforced the importance of keeping all components of an application up-to-date to mitigate potential threats.

<h3>How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?</h3>
I increased layers of security by implementing strict input validation, securing HTTP communications with HTTPS and HSTS, and enhancing access control mechanisms. In the future, I would use a combination of manual code reviews, static analysis tools like Maven Dependency Check, and adherence to industry best practices to assess vulnerabilities and determine the most effective mitigation strategies.

<h3>How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?</h3>
I ensured functionality and security by rigorously testing the application after implementing security enhancements. I re-tested every end point and double checked that I was adhering to secure coding practices. After refactoring, I reran static analysis tools to verify that no new vulnerabilities were introduced. Continuous testing and monitoring were key to maintaining both the application's functionality and its security posture.

<h3>What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?</h3>
I utilized tools like Maven Dependency Check for static analysis and relied on frameworks like Spring Security to enhance authentication and authorization mechanisms. Adopting secure coding practices from OWASP guidelines and keeping dependencies up-to-date are strategies I'll continue to use in future projects. These resources help in proactively identifying and mitigating security risks.

<h3>Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?</h3>
I would showcase the comprehensive vulnerability assessment report and the mitigation plan I developed for Artemis Financial. Demonstrating how I identified critical security issues and implemented effective solutions highlights my ability to enhance application security. This assignment reflects my skills in secure coding, vulnerability assessment, and applying industry best practices to real-world projects.
