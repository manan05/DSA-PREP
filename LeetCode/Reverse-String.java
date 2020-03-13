class Solution {
    public void reverseString(char[] s) {
        int front = 0;  //idx that points to front of the array
        int back = s.length - 1; //idx that points to the back of the array
        for(;front<(s.length/2);front++,back--){ // till s.length/2 so that it doesn't make the array same as question
            char temp = s[front];
            s[front] = s[back];
            s[back] = temp;
        }
    }
}
