- 订单管理系统
2. 订单能支持每个人结帐
3. 订单支持出账单

账单的意思是说按照每天去计算的，有多少的品种，数量和总金额.

特性：
2. 支持上传特片
3. JSON进行交互 (Spring MVC直接读取图片)

2017-09-01
1) 客户要求： 必须要有菜单是可以前台有一件，后台就减一件，是可以看的出来的。开一个库存管理的。担心的是可口可乐那些。
2) 后台基本满意，前台一定要是西班牙文。
3）要赶紧做好前台和收账的功能.

运行SQL:
mysql -h localhost -u root -p
mysql> \. C:\git_workspace\coffee\SQL\18_TB_order_item_adjustment.sql
