#include<iostream>
#include<algorithm>
#include<vector>
 
using namespace std;
int main() {
    int vezes;
    string palavra;
    cin >> vezes;
     
    for(int w=0; w < vezes; w++){
        cin >> palavra;
        vector <char> caracteres;
         
        for(int i=0;i<palavra.length();i++) {
            caracteres.push_back(palavra[i]);
        }
        sort(caracteres.begin(), caracteres.end());
         
        do {
            for(int i=0;i<palavra.length();i++) {
                cout << caracteres[i];
            }
            cout << "\n";
        }while(next_permutation(caracteres.begin(), caracteres.end()));
         
         cout << "\n";
    }
    return 0;
}
