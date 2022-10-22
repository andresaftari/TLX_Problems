void main() {
  List list1 = [1, 2, 3];
  List list = ['a', 'b', 'c'];
  String d = "";

  list.forEach((element) { d = element; });
  print(d);
}