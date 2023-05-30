package CSSelector;

public class CustomCssSelector {

	public static void main(String[] args) {
		// Css selector: Cypress, PW, WDIO
		//Cascaded design sheet 
		//without forward slashes 
		//page: Html + css
		//if the Id is available then - 
		//#id or 
		//tag#ID - # is only use for ID
		
		//class: 
		//.classname
		//if we have many classes only for the login button - then find unique class name out of all classes 
		//tagname.classname
		
		//tag#id.class
		//#id.class
		//tag.class#id
		//.classname#id
		
		//if class names are //c1 c2 c3
		//c1.c2.c3
		//tagname.c1.c2.c3
		//tagname#id.c1.c2.c3 - any combination u can write here 
		
		//in by.class - only pass the unique class name not all five or 4 classes 
		
		//other attribute:
		//tagname[attr='value'] without forward slashes 
		//input[type='email']-css
		//input[@type='email']-xpath (@)
		//input[type='text'][name='firstname'][placeholder='search']- multiple attributes in css
		//if u don't add the attributes values then its also fine in css and xpath also 
		////a[@href] --xpath
		
		//text in css: not applicable 
		
		//contains in css: 
		//tag[attr*='value']-- contains we use *
		//tag[id*='value']
		//use any attribute here 
		//input[class*='login-email']--css
		//input[contains(@class,'login_email')]--xpath
		
		//starts-with in css:
		//tag[attr^='value'] -- starts with use ^
		
		//ends-with in css
		//tag[attr$='value'] ---ends with use $
		
		//parent to child:
		//parent tag'space here'child tag -- space means --> direct + indirect child
		
		
		//parent tag > child tag--->For direct child element
		
		//child to parent : backward traversing is not possible with css
		
		//following sibling in css: not that great 
		//label[for='input-email']+input#input-email --> + for immediate sibling
		
		//all following sibling
		
		//preceding sibling in css: not possible with css
		
		
		
		
		
		
		
	}

}
