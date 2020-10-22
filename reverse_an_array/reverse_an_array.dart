void main() {
  print(reverseAnArray([1, 2, 3, 4, 5]));
}

List<int> reverseAnArray(List<int> list) {
  List<int> arr = [];

  for (int index = list.length - 1; index >= 0; index--) {
    arr.add(list[index]);
  }

  return arr;
}
