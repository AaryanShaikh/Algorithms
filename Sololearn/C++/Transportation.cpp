#include <iostream>
using namespace std;

int main() {
    //your code goes here
    int pw;
    int es;
    cin >> pw;
    es = 50 - ( pw % 50 );
    cout << es;
    
    return 0;
}