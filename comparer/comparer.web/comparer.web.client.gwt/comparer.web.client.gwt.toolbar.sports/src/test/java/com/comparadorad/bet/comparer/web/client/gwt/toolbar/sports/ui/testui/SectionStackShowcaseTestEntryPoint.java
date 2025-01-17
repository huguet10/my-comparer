/**
 *
 * Copyright (C) FACTORIA ETSIA S.L.
 * All Rights Reserved.
 * www.factoriaetsia.com
 *
 */
package com.comparadorad.bet.comparer.web.client.gwt.toolbar.sports.ui.testui;

import com.comparadorad.bet.comparer.web.client.gwt.core.module.AbstractTestEntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.types.VisibilityMode;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.SectionStack;
import com.smartgwt.client.widgets.layout.SectionStackSection;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * The Class SectionStackShowcaseTestEntryPoint.
 */
public class SectionStackShowcaseTestEntryPoint extends AbstractTestEntryPoint {

	/** The last section index. */
	private int lastSectionIndex;

	/** {@inheritDoc} */

	public void onModuleLoad() {
		super.onModuleLoad();
		RootPanel.get().add(getViewPanel());
	}

	/**
	 * Gets the view panel.
	 * 
	 * @return the view panel
	 */
	public Canvas getViewPanel() {
		final SectionStack sectionStack = new SectionStack();
		sectionStack.setVisibilityMode(VisibilityMode.MULTIPLE);
		sectionStack.setWidth(300);
		sectionStack.setHeight(350);
		sectionStack.setBorder("2px solid #458B00");

		SectionStackSection section1 = new SectionStackSection("Blue Pawn");
		section1.setExpanded(true);
		section1.addItem(new Img("pieces/48/pawn_blue.png", 48, 48));
		sectionStack.addSection(section1);

		SectionStackSection section2 = new SectionStackSection("Green Cube");
		section2.setExpanded(true);
		section2.setCanCollapse(false);
		section2.addItem(new Img("pieces/48/cube_green.png", 48, 48));
		sectionStack.addSection(section2);

		SectionStackSection section3 = new SectionStackSection("Blue Cube");
		section3.setExpanded(false);
		section3.addItem(new Img("pieces/48/cube_blue.png", 48, 48));
		sectionStack.addSection(section3);

		lastSectionIndex = 2;

		IButton addButton = new IButton("Add Section");
		addButton.setWidth(150);
		addButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String title = lastSectionIndex % 2 == 0 ? "Yellow Piece"
						: "Blue Cube";
				String iconName = lastSectionIndex % 2 == 0 ? "piece_yellow"
						: "cube_blue";
				SectionStackSection section = new SectionStackSection(title);
				section.setExpanded(lastSectionIndex % 2 == 0);
				section.addItem(new Img("pieces/48/" + iconName + ".png", 48,
						48));
				sectionStack.addSection(section);
				++lastSectionIndex;
			}
		});

		IButton removeButton = new IButton("Remove Section");
		removeButton.setWidth(150);
		removeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				sectionStack.removeSection(lastSectionIndex);
				--lastSectionIndex;
			}
		});

		HLayout layout = new HLayout();
		layout.setMembersMargin(20);
		layout.addMember(sectionStack);

		VLayout buttons = new VLayout();
		buttons.setMembersMargin(10);
		buttons.addMember(addButton);
		buttons.addMember(removeButton);

		layout.addMember(buttons);
		return layout;
	}

}