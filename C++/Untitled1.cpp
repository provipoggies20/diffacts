#include<iostream>
#include<stack>
using namespace std;
int main()
{
	stack<string>elm;
    elm.push("A");
    elm.push("B");
    elm.push("C");
    elm.push("D");
    elm.pop();
    elm.push("D");
    elm.push("E");
    elm.push("F");
    elm.pop();
    elm.pop();
    elm.push("E");
    elm.push("F");
    elm.push("G");
    elm.pop();
    elm.pop();
    cout<<"Peek: "<<elm.top();
    cout<<"\nSize: "<<elm.size()<<endl;  
	while(elm.size()>0)
	{
		cout<<elm.top()<<"\t";
		elm.pop();
	}
}

