# Rabobank
This project is used to generate the Rabobank's customer transaction report.

Prerequiste:
Check out the project in STS IDE and run it in pivotal server. 

Steps to test:
Make an api call from Restclient in web browser(Chrome or Mozilla).

API : For Local: http://localhost:8080/statement/report

Input Data:
<records>
	<record>
		<reference>130498</reference>
		<accountNumber>NL69ABNA0433647324</accountNumber>
		<description>Tickets for Peter Theuß</description>
		<startBalance>26.9</startBalance>
		<mutation>18.78</mutation>
		<endBalance>8.12</endBalance>
	</record>
	<record>
		<reference>178959</reference>
		<accountNumber>NL69ABNA0433647325</accountNumber>
		<description>Tickets from Erik de Vries</description>
		<startBalance>26.9</startBalance>
		<mutation>18.78</mutation>
		<endBalance>8.12</endBalance>
	</record>
	<record>
		<reference>130498</reference>
		<accountNumber>NL69ABNA0433647324</accountNumber>
		<description>Tickets for Peter Theuß</description>
		<startBalance>26.9</startBalance>
		<mutation>18.78</mutation>
		<endBalance>8.12</endBalance>
	</record>
</records>

Sample Output:

{"178959":"Tickets from Erik de Vries","130498":"Tickets for Peter TheuÃ"}
