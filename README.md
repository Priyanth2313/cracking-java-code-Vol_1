# **Cracking-Java-Code (CJC) - 2018-2019**

> Cracking Java Code is a coding series started by me as I continued to learn code in my  own way. Each step is logged on a daily basis and this repository some day may become an open source knowledge and guide to start off every coder with the basics of the language and slowly to a much deeper level of understanding with the help example code and theoretical explanation.

## **Disclaimer**

> The purpose of this repository is to give you an idea and understanding about java code syntax and to guide you if you are confused about what to learn and
> how to learn and what not to learn when coding in java. Repository will be updated whenever I learn new 'stuff' in java. Meanwhile, this repository has the 
> knowledge and context upto my complete understanding of the concept irrespective of any source. What this repository comprises of no textual information from 
> any sources but rather own implications and ideas from gathering and reading many sources. Completing this series means you are code ready and not job ready.

------------------
## **Context**





------------------
### **Object Oriented Programming

### Identifiers and Modifiers

**Modifiers:** 
**Non Access Modifiers**
* static modifier for creating class methods and variables
* final modifier for finalizing the implementations of  classes, methods and variables
* abstract modifier for creating abstract classes and methods
* synchronized and volatile: these are used for threads

**Access Modifiers**
* Default: visible to the package no modifiers are required
* Protected: visible to the package and its sub classes
* Public:  Visible globally
* Private: Visible to the class members

<dl>
	<dt><strong>Identifiers:</strong></dt>
	<dd>Identifiers are the names of variables, methods, classes, packages and interfaces. Unlike literals they are not the things themselves, just ways of referring to them. In the HelloWorld program, HelloWorld , String , args , main and println are identifiers</dd>
</dl>

------------
### Variables in Java:
**Concepts related to variables**
* Declaration
* Initialization
**Types**
<dl>
	<dt><strong>Local Variables</strong></dt>
	<dd>Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block. No access modifiers and initial value should be assigned when declared.</dd>
	<dt><strong>Instance Variables</strong></dt>
	<dd>Instance variables are declared in a class, but outside a method, constructor or any block. Created when 'new' is used.  Access modifiers can be used. These have default value and are declared in class level so can be accessed by the class members.</dd>
	<dt><strong>Static/Class Variables</strong></dt>
	<dd>Class/Static variables declared with the static keyword in a class, but outside a method, constructor or block. Only a single copy of static variable can be created and can be re used in the class and its static methods.</dd>
</dd>
-----------

### Final and Static Keyword:
**Final:**
<dl>
	<dt><strong>Final Variable</strong></dt> 
	<dd>The only difference between a normal variable and a final variable is that we can re-assign value to a normal variable but we cannot change the value of a final variable once assigned. Hence final variables must be used only for the values that we want to remain constant throughout the execution of program.</dd>
	<dt><strong>Final class</strong></dt>
	<dd>It cannot be extended or sub-classed hence used for blocking inheritance</dd>
	<dt><strong>Final Method</strong></dt>
	<dd>A final method cannot be overridden by sub-classes. prevents method overriding</dd>
</dl>

**Static:**
<dl>
	<dt><strong>Static variable:</strong></dt>
	<dd>When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. static variables are created at class level only.</dd>
	<dt><strong>Static Methods</strong></dt>
	<dd>
	<ul>They can only be directly call other static methods.</ul> 
	<ul>They can only directly access static data.</ul>
	<ul>They cannot refer to this or super in any way.</ul></dd>
	<dt><strong>Nested Static Class</strong></dt>
	<dd>Only nested class/inner class can be static but not the outer class</dd>
</dl>
---------------

