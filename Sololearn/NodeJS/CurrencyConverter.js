function main() {
    var amount = parseFloat(readLine(), 10);
    var rate = parseFloat(readLine(), 10);
    function convert(amount,rate){
        return amount*rate;
    }
    console.log(convert(amount, rate));
}