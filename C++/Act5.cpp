#include<iostream>
using namespace std;
int main(){
	int whitespace=7;
    for(int x=1; x<=7; x++){
    	for(int y=1;y<=whitespace;y++){
    		cout<<" ";
		}
		whitespace--;
        for(int z=1; z<=x; z++){
            cout<<"* ";	
        }
        cout<<endl;
    }
    whitespace=2;
    for(int x=1; x<=7-1; x++){
    	for(int y=1;y<=whitespace;y++){
    		cout<<" ";
		}
		whitespace++;
        for(int z=1; z<=7-x;z++){
            cout<<"* ";	
        }
        cout<<endl;
    }
}

