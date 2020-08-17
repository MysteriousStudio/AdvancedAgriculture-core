# Commit命名规则

代码的提交信息需要规范化管理。故特在此提出新的倡议

以下的各种方案格式均为：{Type}-{Operation}：{Message}。

因此在以后提交代码需要分开提交，例如新增加了feature于AgriMaterial.kt与AgriItemRegistry.kt之中，但是在这一次的代码更新中我还写了Commit.md文件，修复了一些错误在AgriOreRegistry.kt当中，

则我应当先提交一次AgriMaterial.kt，AgriItemRegistry.kt,commit信息写为 _“feat-add：新增加了xxx特性”_

然后提交Commit.md，commit信息写为 _“update-add：新增加了commit说明文件”_

提交AgriOreRegistry.kt，commit信息写为 _“fix-bugs：修复了xxx漏洞”_

其中Message可以为中文。

Type列表：
 - update：更新一些内容，不影响原先的工作。
 - feat：新增或者删除特性。影响之前的代码的工作。
 - merge：合并内容，从其他的分支合并代码
 - fix：修复之前的错误
 
 其中Operation选项为可选，用于补充Type的动作