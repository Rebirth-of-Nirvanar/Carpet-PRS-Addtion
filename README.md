# Carpet PRS Addition

依赖于 [fabric-carpet](https://github.com/gnembon/fabric-carpet) 的附属模组.

## 新增的功能

### 生物破坏
- [生物破坏覆写](#生物破坏覆写-mobGriefingOverride)
- [村民耕作](#村民耕作-mobGriefingFarmerVillagerShouldRun)
- [凋零爆炸控制](#凋零爆炸控制-mobGriefingWitherCreateExplosion)
- [凋零方块破坏控制](#凋零方块破坏控制-mobGriefingWitherCanDestroy)
- [末影龙方块破坏控制](#末影龙方块破坏控制-mobGriefingEnderDragonDestroyBlocks)
- [苦力怕爆炸控制](#苦力怕爆炸控制-mobGriefingCreeperCreateExplosion)
- [末影人拾取方块控制](#末影人拾取方块控制-mobGriefingEnderManPickUpBlock)
- [末影人放置方块控制](#末影人放置方块控制-mobGriefingEnderManPlaceBlock)
- [唤魔者的魔法](#唤魔者的魔法-mobGriefingEvokerWololo)
- [猪灵拾取](#猪灵拾取-mobGriefingPiglinGather)
- [劫掠兽破坏](#劫掠兽破坏-mobGriefingRavagerBreakBlocks)
- [蠹虫感染](#蠹虫感染-mobGriefingSilverfishInfectStones)
- [蠹虫破壳](#蠹虫破壳-mobGriefingSilverfishOutOfBlocks)
- [狐狸摘浆果](#狐狸摘浆果-mobGriefingFoxEatSweetBerries)
- [兔子吃胡萝卜](#兔子吃胡萝卜-mobGriefingRabbitEatCarrotCrop)
- [雪傀儡产雪](#雪傀儡产雪-mobGriefingSnowGolemSpawnSnow)
- [火球爆炸](#火球爆炸-mobGriefingFireballCreateExplosion)
- [小火球引燃](#小火球引燃-mobGriefingSmallFireballSpawnFire)
- [凋零之首爆炸](#凋零之首爆炸-mobGriefingWitherSkullCreateExplosion)

## 列表

### 生物破坏覆写 (mobGriefingOverride)

当启用此选项游戏规则 `mobgriefing` 将失效.

- 类型: `boolean`
- 默认值: `false`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 村民耕作 (mobGriefingFarmerVillagerShouldRun)

职业为农夫的村民是否进行耕作.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 凋零爆炸控制 (mobGriefingWitherCreateExplosion)

凋零生成后发生地爆炸是否破坏地形..

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 凋零方块破坏控制 (mobGriefingWitherCanDestroy)

凋零受到伤害时是否破坏方块.

仅当游戏规则 mobgriefing 为 true 时生效.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 末影龙方块破坏控制 (mobGriefingEnderDragonDestroyBlocks)

末影龙是否破坏途径的方块.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 苦力怕爆炸控制 (mobGriefingEnderDragonDestroyBlocks)

苦力怕发生地爆炸是否破坏地形.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 末影人拾取方块控制 (mobGriefingEnderManPickUpBlock)

末影人是否能够拾取方块.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 末影人放置方块控制 (mobGriefingEnderManPlaceBlock)

末影人是否能够放置方块.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 唤魔者的魔法 (mobGriefingEvokerWololo)

唤魔者是否能改变周围羊毛的颜色.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 猪灵拾取 (mobGriefingPiglinGather)

猪灵是否能够拾取物品.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 劫掠兽破坏 (mobGriefingRavagerBreakBlocks)

劫掠兽是否能够破坏方块.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 蠹虫感染 (mobGriefingSilverfishInfectStones)

蠹虫是否能够感染石头类方块.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 蠹虫破壳 (mobGriefingSilverfishOutOfBlocks)

蠹虫是否能够感染石头类方块.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 狐狸摘浆果 (mobGriefingFoxEatSweetBerries)

狐狸是否能够摘取甜浆果.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 兔子吃胡萝卜 (mobGriefingRabbitEatCarrotCrop)

兔子是否能够吃胡萝卜.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 雪傀儡产雪 (mobGriefingSnowGolemSpawnSnow)

雪傀儡是否能够在移动时产生雪片.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 火球爆炸 (mobGriefingFireballCreateExplosion)

雪傀儡是否能够在移动时产生雪片.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 小火球引燃 (mobGriefingFireballCreateExplosion)

小火球是否能够在接触方块时时产生火焰.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`

### 凋零之首爆炸 (mobGriefingWitherSkullCreateExplosion)

凋零之首是否产生爆炸.

- 类型: `boolean`
- 默认值: `true`
- 参考选项: `true`, `false`
- 分类: `PRS`, `mobGriefing` `FEATURE`