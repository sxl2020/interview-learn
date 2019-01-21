### 用数组结构实现大小固定的队列和栈

| 时间 | 笔记 |
|---|---|
|2019.1.21|栈的实现|
|要点1|栈的主要操作有:peek()、pop()以及push().|
|要点2|用数组实现栈，引入了一个size来标识栈中元素的个数。出栈入栈需要将size与栈长比较|
|    |队列的实现|
|要点1|队列中的三要素：first、end以及解耦first与end边界关系中的size。|
|   |first指向队列中的第一个元素，end指向待插入队列中的数的位置。|
|**精髓之处**|通过引入变量size，通过size来判断是否满栈，而不是用first和end之间的关系，这样更好理解！|