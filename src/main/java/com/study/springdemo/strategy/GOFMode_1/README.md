

## 策略模式

- 策略模式定义了一系列的算法，并将每一个算法封装起来，而且它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。

### 使用场景

- 针对同一类型问题的多种处理方式，仅仅是具体行为有差别时。
- 需要安全的封装多种同一类型的操作时
- 出现同一抽象多个子类，而又需要使用if-else 或者 switch-case来选择时


### 示例
  A旗舰店除了正常日不打折，在节假日会推出满300减100，全场8折等活动