function main() {
    var increase = parseInt(readLine(), 10);
    var prices = [98.99, 15.2, 20, 1026];
    const num = prices.map(s => { return increase+s });
    console.log(num)
}