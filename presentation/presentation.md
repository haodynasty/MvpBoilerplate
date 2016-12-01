## 一. 模块作用
负责展示图形界面，并填充数据，该层囊括了 View 和 Presenter （上图所示的Model我理解为 ViewModel -- 为 View 提供数据的 Model，或称之为 VO -- View Object）。

## 二. 规范建议
1. 按照模块划分，每个模块建立一个包可以按照功能划分
2. 每个包下面分activity,fragment,api(通信api，由data层RestAPI统一管理),adapter,presenter,receiver,service,vo（view object）
3. 公共包util, base, widget
4. 公共常量类,可以仿照android系统的R.java来写，如果是公共的都写在常量类中，不是公共的则写在各个模块中。