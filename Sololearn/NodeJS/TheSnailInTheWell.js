function main() {
    var depth = parseInt(readLine(), 10);
    let i=0,count=0;
    while(true){
       count++;
       i=i+7;
       if(i>=depth){
           break;
       }else{
           i=i-2;
       }
    }
    console.log(count);
}