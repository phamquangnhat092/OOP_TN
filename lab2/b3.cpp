#include<bits/stdc++.h>
using namespace std;
void TRY(int k){
    for (int v = 1; v <= 2*N; v++){
        if (check(v,k)) {
            x[k] = v;
            f += A[x[k-1]][x[k]];
            if (v <= N) load += 1;
            else load -= 1;
        }
    }
}