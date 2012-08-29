###DUEDIL RESTFull API - Clients and Example
You can find PHP Client here:
    
    HERE

Java Client here:

    HERE
    
And here below you can find HTTP Call example 

###API Search Example

Search company "duedil":

    http://api.duedil.com/search/find/companies?query=duedil&api_key=test

Search director "daniel":

    http://api.duedil.com/search/find/directors?query=daniel&api_key=test

###API endpoints available 
On each of this endpoints you can add the param "fields". 
You can also use the shortcut "fields=get_all" to get all the data available in that url.
"Fields" is not mandatory.

Get company by id with fields name,accountsTurnover,latestAccountsDate,incorporationDate:

    http://api.duedil.com/uk/company/06999618?api_key=test&fields=name,accountsTurnover,latestAccountsDate,incorporationDate

with all fields

    http://api.duedil.com/uk/company/06999618?api_key=test&fields=get_all

with default fields

    http://api.duedil.com/uk/company/06999618?api_key=test

Get companies by director id 903216621:

    http://api.duedil.com/uk/director/903216621/companies?api_key=test

Get Credit Limits from company id:

    http://api.duedil.com/uk/company/06999618/credit-limits?api_key=test

Get credit Ratings from company id

    http://api.duedil.com/uk/company/06999618/credit-ratings?api_key=test

Get Previous Company Name from company id:

    http://api.duedil.com/uk/company/06999618/previous-company-names?api_key=test

Get Registered Address from company id:

    http://api.duedil.com/uk/company/06999618/registered-address?api_key=test

Get Bank Accounts form company id:

    http://api.duedil.com/uk/company/06999618/bank-accounts?api_key=test

Get Secondary Industries form company id:

    http://api.duedil.com/uk/company/06999618/secondary-industries?api_key=test

Get Shareholdings form company id:

    http://api.duedil.com/uk/company/06999618/shareholdings?api_key=test

Get all directorships by company id:

    http://api.duedil.com/uk/directorships/company/06999618?api_key=test

Get all directorships by director id:

    http://api.duedil.com/uk/director/903216621/directorships?api_key=test

Get tha accounts (with account type) by company id:

    http://api.duedil.com/uk/company/06999618/accounts?api_key=test

Get account details by account id and account type:

    http://duedil.stage/uk/company/06999618/accounts/{account_id}/{accounts_type}?api_key=test&fields=get_all 

Get director by director id:

    http://api.duedil.com/uk/director/903216621?api_key=test

Get directors by company id:

    http://api.duedil.com/uk/director/903216621/companies?api_key=test

###API Endpoint available only for UK companies:

Get service Address for single directorship

    http://api.duedil.com/uk/directorships/06999618_914039209_True_None/service-addresses?api_key=test

Get mortgages for single company

    http://api.duedil.com/uk/company/06999618/mortgages?api_key=test

Get documents for single company

    http://api.duedil.com/uk/company/06999618/documents?api_key=test

###API Traversal Example:

Get company details and credit limits (fields: id,creditLimit) for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"creditLimits","fields":"id,creditLimit"}

Get company details and credit limits (with limit 1 , offset 2 and fields: id,creditLimit) for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&t={"from":"creditLimits","fields":"id,creditLimit","limit":"1","offset":"2"}

Get company details (fields default), credit limits (fields date) and directors (join directorships) for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&t=[{"from":"creditLimits","fields":"date"},{"from":"directors","join":"directorships"}]

Get company details (fields default) and directors (join directorships, with limit 1 and offset 2) for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&t={"from":"creditLimits","fields":"id,creditLimit","limit":"1","offset":"2"}

Get company details and accounts for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"accounts"}

Get company details and creditLimits for company with id  = 06999618
    
    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"creditLimits"}

Get company details and creditRatings for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"creditRatings"}

Get company details and directors (join directorships) for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"directors","join":"directorships"}

Get company details and serviceAddress (join directorships) for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"serviceAddress","join":"directorships"}

Get company details and previousCompanyNames for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"previousCompanyNames"}

Get company details and registeredAddress for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"registeredAddress"}

Get company details and secondaryIndustries for company with id  = 06999618
    
    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"secondaryIndustries"}

Get company details and shareholdings for company with id  = 06999618
    
    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"shareholdings"}

Get company details and documents for company with id  = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"documents"}

Get company details and mortgages for company with id  = 06999618
    
    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"mortgages"}

Get company details and bankAccounts for company with id  = 06999618
    
    http://api.duedil.com/uk/company/06999618?api_key=test&traversal={"from":"bankAccounts"}

###API Advanced Traversal Example:

Get company details and mortgages, shareholdings, documents, creditRatings and creditLimits for company with id = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal=[{"from":"mortgages"},{"from":"shareholdings"},{"from":"documents"},{"from":"creditRatings"},{"from":"creditLimits"}]

Get company details and creditLimits (fields: date), directors (join directorships) and accounts (fields: solicitors and accountants) for company with id = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&t=[{"from":"creditLimits","fields":"date"},{"from":"directors","join":"directorships"},{"from":"accounts","fields":"solicitors,accountants"}]

Get company details and accounts (fields: solicitors and accountants), documents (fields: type,date,description) and mortgages (fields:personsEntitled) for company with id = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal=[{"from":"accounts","fields":"solicitors,accountants"},{"from":"documents","fields":"type,date,description"},{"from":"mortgages","fields":"personsEntitled"}]

Get company details and accounts (fields: solicitors and accountants), documents (fields: type,date,description) and mortgages (fields:personsEntitled) for company with id = 06999618

    http://api.duedil.com/uk/company/06999618?api_key=test&traversal=[{"from":"serviceAddress","join":"directorships","fields":"postcode"},{"from":"directors","join":"directorships","fields":"surname"}]

Get director details and companies (join directorships) for director with id = 903216621

    http://api.duedil.com/uk/director/903216621?api_key=test&t={"from":"company","join":"directorships"}

Get director details and serviceAddress (join directorships) for director with id = 903216621

    http://api.duedil.com/uk/director/903216621?api_key=test&t={"from":"serviceAddress","join":"directorships"}
  
###API Traversal Linkedin style Example:
    TODO 
###API Advanced Traversal Linkedin style Example:
    TODO
