#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int r;
    for ( n; n>0; n--){
    
		r = n % 5;
    	if ( r == 0){
    		cout << n << endl;
    		cout << "Beep" << endl;
    	}
    	else {
    		cout << n << endl;
    	}
    }
    
    
    return 0;
}