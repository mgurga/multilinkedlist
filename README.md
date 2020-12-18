# multilinkedlist
multi linked list implementation in java.

A multi linked list is a type of list where each child has multiple children, in the case of this project, 2. 
This type of list is perfect for dealing with large amounts of data because because the data variable is rarly every read and data is never removed,
this is shown in the output where the 'bazrow' node is removed.

## Diagram
![multi linked list diagram](https://raw.githubusercontent.com/mgurga/multilinkedlist/master/docs/diagram.png)

## Output (from Diagram)
```
data: foo
┣row: data: bar
┃	┃┣row: data: barrow
┃	┃	┃┣row: null
┃	┃	┃┣col: null
┃	┃┣col: data: barcol
┃	┃	┃┣row: null
┃	┃	┃┣col: null
┣col: data: baz
┃	┃┣row: data: bazrow
┃	┃	┃┣row: data: bazcolrow2
┃	┃	┃	┃┣row: null
┃	┃	┃	┃┣col: null
┃	┃	┃┣col: data: bazcolrowcol
┃	┃	┃	┃┣row: null
┃	┃	┃	┃┣col: null
┃	┃┣col: data: bazcol
┃	┃	┃┣row: data: bazcol2row
┃	┃	┃	┃┣row: null
┃	┃	┃	┃┣col: null
┃	┃	┃┣col: data: bazcol3
┃	┃	┃	┃┣row: null
┃	┃	┃	┃┣col: null

'bazrow' data: bazrow
Removed 'bazrow'

data: foo
┣row: data: bar
┃	┃┣row: data: barrow
┃	┃	┃┣row: null
┃	┃	┃┣col: null
┃	┃┣col: data: barcol
┃	┃	┃┣row: null
┃	┃	┃┣col: null
┣col: data: baz
┃	┃┣row: data: bazcolrow2
┃	┃	┃┣row: null
┃	┃	┃┣col: null
┃	┃┣col: data: bazcol
┃	┃	┃┣row: data: bazcol2row
┃	┃	┃	┃┣row: null
┃	┃	┃	┃┣col: null
┃	┃	┃┣col: data: bazcol3
┃	┃	┃	┃┣row: null
┃	┃	┃	┃┣col: null
```

## Console Screenshot
![multi linked list console output](https://github.com/mgurga/multilinkedlist/blob/master/docs/eclipseout.png)
