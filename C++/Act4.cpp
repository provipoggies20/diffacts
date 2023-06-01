#include<iostream>
using namespace std;
int main(){
    string name, year;
    int midgrade,tengrade,value;
    double fingrade;
        cout<<"Enter Your Name: ";
        cin>>name;
        getline(cin, name);
        cout<<"Enter Your Year and Course: ";
        cin>>year;
        //enter grade
        cout<<"Enter Midterm Grade: ";
        cin>>midgrade;
        cout<<"Enter Final Tentative Grade: ";
        cin>>tengrade;
        //compute
        double tenmidgrade, tenfingrade;
        tenmidgrade=midgrade*0.4;
        tenfingrade=tengrade*0.6;
        fingrade=tenmidgrade+tenfingrade;
        value=(int)fingrade;
        //display
        cout<<"Your Final Grade is "<<value<<endl;
        if(value>=90&&value<=98) cout<<"Remarks: A";
        else if(value>=85&&value<=89) cout<<"Remarks: B";
        else if(value>=80&&value<=84) cout<<"Remarks: C";
        else if(value>=75&&value<=79) cout<<"Remarks: D";
        else cout<<"Remarks: Failed";
    }
