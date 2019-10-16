#面经
##一. java基础

##二. 多线程

##三. spring

##四. jvm

##五. io

##六. 数据库

##七. 网络基础

####1. 网络模型	
- OSI七层模型

|OSI模型 | 功能  | TCP/IP协议 |
|  :---  | :----  |:----|
| 应用层| 文件传输，文件服务<br>虚拟终端，电子邮件 |**_HTTP，DNS_**，TFTP<br>SNMP，FTP，SMTP		|
| 表示层| 数据格式化，代码转换<br>数据加密 |	没有协议	|
| 会话层 | 解除或建立与别的接点的联系 |		没有协议|
| 传输层 | 提供端对端的接口  |	**_TCP，UDP_**	|
| 网络层 | 为数据包选择路由 |	_**IP**_，ICMP，RIP，OSPF，BGP，IGMP	|
| 数据链路层| 传输有地址的帧以及<br>错误检测功能 |	ARP,SLIP，CSLIP<br>PPP，RARP，MTU	|
| 物理层 | 以二进制数据形式在<br>物理媒体上传输数据 |	ISO2110，IEEE802，IEEE802.2	|

-TCP/IP四层模型

|TCP/IP模型 | 功能  | TCP/IP协议 |
|  :---  | :----  |:----|
| 应用层| 直接为用户的应用进程提供服务<br>包括OSI模型的上三层 |**_HTTP，DNS_**，TFTP<br>SNMP，FTP，SMTP		|
| 传输层 | 向两个主机中进程之间的通信提供服务  |	**_TCP，UDP_**	|
| 网络层 | 负责为分组交换网上的不同主机提供通信服务 |	_**IP**_，ICMP，RIP，OSPF，BGP，IGMP	|
| 数据链路层| 将网络层交下来的 IP 数据报组装成帧在两<br>个相邻结点（主机和路由器，或两个路由器)<br>之间的链路上“透明”地传送帧中的数据,包括OSI模型中的下两层 |	ARP,SLIP，CSLIP<br>PPP，RARP，MTU	|

-常见的每层的代表协议

1. 应用层: (典型设备:应用程序，如FTP，SMTP ，HTTP) 

_**HTTP**_  （Hypertext Transfer Protocol ）超文本传输协议 <端口号 80>， 面向事务的应用层协议
**SMTP** （Simple Mail Transfer Protocol ）简单邮件传输协议 <端口号25> 用于发送邮件。
**FTP** （File Transfer Protocol）文件传输协议<端口号21> 减少或消除不同操作系统下处理文件的不兼容性。

2. 传输层:  (典型设备:  进程和端口)       数据单元：数据段 （Segment） 

_**TCP**_  （Transmission Control Protocol ）传输控制协议提供**可靠的面向连接**的服务，传输数据前须先建立连接，结束后释放。可靠的全双工信道。可靠、有序、无丢失、不重复。 

_**UDP**_ (User Datagram Protocol ）用户数据报协议发送数据前**无需建立连接**，不使用拥塞控制，不保证可靠交付，**最大努力交付**。

3. 网络层: (典型设备:路由器，防火墙、多层交换机) 数据单元：数据包（Packet ） 

_**IP**_ (IPv4 · IPv6) (Internet Protocol) 网络之间互连的协议 

_**ARP**_ (Address Resolution Protocol) 即地址解析协议，实现通过IP 地址得 知其物理地址。 

**RARP** (Reverse Address Resolution Protocol)反向地址转换协议允许局域 网的物理机器从网关服务器的 ARP 表或者缓存上请求其 IP地址。 

**ICMP** (Internet Control Message Protocol ）Internet 控制报文协议。它是TCP/IP 协议族的一个子协议，用于在IP 主机、路由器之间传递控制消息。 

4. 数据链路层: (典型设备:  网卡，网桥，交换机)  数据单元：帧 （Frame）
 **PPP**(Point-to-Ponit Protocol)点对点协议面向字节，由三部分组成：一个将IP 数据报封装到串行链路的方法；一个用于建立、配置和测试数据链路连接的链路控制协议

停止等待协议： 
 **CSMA/CD**(Carrrier Sense Multiple Access with Collision Detection)载波监听多点接入/碰撞检测协议。总线型网络，协议的实质是载波监听和碰撞检测。载波监听即发数据前先检测总线上是否有其他计算机在发送数据，如暂时不发数据，避免碰撞。碰撞检测为计算机边发送数据边检测信道上的信号电压大小。

**_ARQ_**（Automatic Repeat-reQuest ）自动重传请求协议，错误纠正协议之一，包括停止等待ARQ 协议和连续ARQ 协议，错误侦测、正面确认、逾时重传与负面确认继以重传等机制。

5. 物理层:(典型设备：中继器，集线器、网线、HUB)     数据单元：比特 （Bit）