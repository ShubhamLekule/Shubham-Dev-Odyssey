package com.practice.udemy.staticelement.testrun;

public class TestStatic {
int normalVariable=0;
static int staticVariable=0;

public int getNormalVariable() {
	return normalVariable;
}
public static int getStaticVariable() {
	return staticVariable;
}
public void setNormalVariable(int normalVariable) {
	this.normalVariable = normalVariable;
}
//static variable access by static method
public static void setStaticVariable(int staticVariable) {
	TestStatic.staticVariable = staticVariable;
}

}
