package cc.mrbird.web.controller;

import cc.mrbird.common.annotation.Log;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Log("进入游戏界面")
	@RequestMapping("game")
	public String index() {
		return "web/game/snake3D";
	}
}
