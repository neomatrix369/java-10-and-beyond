**JEP 314: Additional Unicode Language-Tag Extensions example**


Java SE 9 support BCP 47 U language-tag extensions to `calendars (ca)` and `numbers (nu)`. Java 10 add support for the additional extensions:

	cu (currency type)
	fw (first day of week)
	rg (region override)
	tz (time zone)


This example show how those extensions can be used to combine or create much more specific Locales. This example is design to be work on JShell, but if you want you can try to make it on a Java Class.


You can run this example on your local JShell or online. For more information about JShell you can go to:  https://github.com/AdoptOpenJDK/jdk9-jigsaw/tree/master/session-3-jshell

To execute Local JShell run next command

     jshell
     
Verify you are using JShell for Java 10 version

    |  Welcome to JShell -- Version 10
    |  For an introduction type: /help intro


To execute JShell online go to next URL

    https://tryjshell.org
    
Verify you are using JShell for Java 10 version

    |  Welcome to JShell -- Version 10
    |  For an introduction type: /help intro
    
    
Once you are on JShell, try to do next exercises. 



1. Create a Locale for your country using the two parameters constructor
	
	 Locale myLocale = new Locale("es","CO"); // `es` is for the language Spanish and `CO` for the country Colombia
	 
	 Next link is useful to know the values for each country https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry
	 
2. Run next statements and take note of the results

		System.out.println(Currency.getInstance(myLocale)); // it shows your country's currency
	 
		System.out.println(Calendar.getInstance(myLocale).getFirstDayOfWeek()); // it shows your country's first Day of the week: 1 for Sunday, 2 for Monday, 3 for Wednesday and so on.   

		System.out.println(NumberFormat.getInstance(myLocale).format(123456789)); // it shows your country's number format style
	
		System.out.println(DateFormat.getDateInstance(1,myLocale).format(new Date())); // it shows your country's date
	
3. Now, work in pairs, each one choose a different language/country, it is much better if the countries are in different continents, 
create a new Locale, execute the same statements of previous step and compare the result.

4. Finally we are going to use the extension support added on Java 10, this time you must create your Locale using a `Local.Builder` as it shows next. 
  Replace the letters xx and YY for the Language / Country that you used in the first exercise, and then execute the statements of the step number 2. 
  **Note:** If you are testing with France you must change the FR letters on `FRzzzz` for other country, e.g. `UKzzzz`, `COzzzz`, `BRzzzz` 

		Locale myLocale  = new Locale.Builder().setLanguage("xx").setRegion("YY") .setExtension('u',"rg-FRzzzz").build();

5. The final challenge is to define un Locale for your country, that uses a different language, with Friday as the first
 day of the week, USD as currency and uses Javanese digits. You should use the statements in the step number two to test your Locale.
 You can use next commando to verify the Locale tha you have created:
 
		System.out.println(myLocale.getDisplayName());
