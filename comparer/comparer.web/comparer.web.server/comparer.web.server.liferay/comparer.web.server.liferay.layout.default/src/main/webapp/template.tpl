<div class="template" id="main-content" role="main">
	<div class="portlet-layout">
		<div class="aui-w10 portlet-column portlet-column-first" id="column-1">
			$processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")
		</div>
		<div class="aui-w90 portlet-column portlet-column-last" id="column-2">
			$processor.processColumn("column-2", "portlet-column-content portlet-column-content-last")
		</div>
	</div>
	<div class="portlet-layout">
		<div class="portlet-column portlet-column-only" id="column-3">
			$processor.processColumn("column-3", "portlet-column-content portlet-column-content-only")
		</div>
	</div>
	<div class="portlet-layout">
		<div class="portlet-column portlet-column-only" id="column-4">
			$processor.processColumn("column-4", "portlet-column-content portlet-column-content-only")
		</div>
	</div>
</div>
