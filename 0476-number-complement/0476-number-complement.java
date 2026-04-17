class Solution {
    public int findComplement(int num) {
        int temp=num;
        int i=0; 
        while(temp > 0){
            if( (temp & 1)== 1){
                num= num- (1<<i);
            }
            else{
                num= num + (1<<i);
            }
            temp>>=1;
            i++;
        }
        return num;
    }
}