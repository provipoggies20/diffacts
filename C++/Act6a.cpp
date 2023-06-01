#include<iostream>
#include<vector>
using namespace std;
int main(){
	std::vector<string>my_Names;   
    my_Names.push_back("Chino");   
    my_Names.push_back("Granel");   
	my_Names.push_back("Elcid");   
	my_Names.push_back("Elsa");   
	my_Names.push_back("Lyca");   
	my_Names.push_back("Bryce");   
	my_Names.push_back("Christine");   
	my_Names.push_back("Elian");   
	my_Names.push_back("Ian");   
	my_Names.push_back("Jhimar");   
	for(string x:my_Names){
        std::cout<<x<<"\n";
    }
}
