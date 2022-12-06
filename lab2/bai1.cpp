#include<bits/stdc++.h>
using namespace std;
#define N 100
int n,M;
int x[N];
int A[N];
int visited[N];
int f;
int countk;

void solution(){
    countk++;
}

void Try(int k){
    for(int v=1;v<=M-f;v++){
        x[k] = v;
        f += v*A[k];
        if(k == n){
            if(f == M ) solution();         
        }
        else Try(k+1);
        f -=v*A[k];       
    }
}

int main(){
    f =0;
    cin >> n >> M;
    for(int i=1;i<=n;i++){
        cin >> A[i];
    }
    Try(1);

    cout << countk;
    return 0;
}