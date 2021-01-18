class Add {
  constructor(...words) {
      this.words = words;
  }
  print(){
    const res = this.words.map(s => {
       return "$"+s 
       });
     console.log(res.toString().split(',').join('')+"$");
  }
}

var x = new Add("hehe", "hoho", "haha", "hihi", "huhu");
var y = new Add("this", "is", "awesome");
var z = new Add("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit");
x.print();
y.print();
z.print();