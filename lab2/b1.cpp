#include<bits/stdc++.h>
using namespace std;

#define MAX 1000
int n, M, f;
int countx; 
int A[MAX];
int x[MAX];

void result(){
    countx++;
}
void TRY(int k){
    
    for (int y = 1; y <= (M - f); y++){
        
        x[k] = y;
        f += y*A[k];

        if (k == n){ 
            if(f == M) result();
        } else TRY(k+1);
        f -= y*A[k];
    }
}

int main(){
    int f =0;
    cin >> n >> M;
    
    for (int i=1; i<=n;i++){
        cin >> A[i];
    } 
    TRY(1);
    cout << countx << endl;
    return 0;
}