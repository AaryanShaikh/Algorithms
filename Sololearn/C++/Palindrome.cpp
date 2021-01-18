#include <iostream>
using namespace std;

bool isPalindrome(int x) {
    //complete the function
    int y, reverse=0, rem;
    y=x;
    while (y!=0){
    	rem=y%10;
    	reverse=reverse*10+rem;
    	y/=10;
    }
    if (x==reverse){
    	return true;
    }
    else {
    	return false;
    }
    
}

int main() {
    int n;
    cin >>n;
    
    if(isPalindrome(n)) {
        cout <<n<<" is a palindrome";
    }
    else {
        cout << n<<" is NOT a palindrome";
    }
    return 0;
}