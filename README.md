# Multiple ways to copy file in Java

Inspired by this [blog](https://baptiste-wicht.com/posts/2010/08/file-copy-in-java-benchmark.html)

All of the ways i've found:

Method | Detail
--- | ---
Native Copy | Make the copy using the cp executable of Linux
Naive Streams Copy | Open two streams, one to read, one to write and transfer the content byte by byte.
Naive Readers Copy | Open two readers, one to read, one to write and transfer the content character by character.
Buffered Streams Copy | Same as the first but using buffered streams instead of simple streams.
Buffered Readers Copy | Same as the second but using buffered readers instead of simple readers.
Custom Buffer Stream Copy | Same as the first but reading the file not byte by byte but using a simple byte array as buffer.
Custom Buffer Reader Copy | Same as the fifth but using a Reader instead of a stream.
Custom Buffer Buffered Stream Copy | Same as the fifth but using buffered streams.
Custom Buffer Buffered Reader Copy | Same as the sixth but using buffered readers.
NIO Buffer Copy | Using NIO Channel and using a ByteBuffer to make the transfer.
NIO Transfer Copy | Using NIO Channel and direct transfer from one channel to other.
Path (Java 7) Copy | Using the Path class of Java 7 and its method copyTo()


